import org.mlir.Bindings
import org.mlir.MlirStringRef
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.SegmentAllocator


fun mlirStringRefCreate(memorySession: MemorySession, allocator: SegmentAllocator, str: String): MemorySegment {
    val modStr = memorySession.allocateUtf8String(str)
    val stringRefStruct = MlirStringRef.allocate(allocator)
    MlirStringRef.`length$set`(stringRefStruct, str.codePoints().count())
    MlirStringRef.`data$set`(stringRefStruct, modStr.address())
    return stringRefStruct
}

fun main(args: Array<String>) {
    System.load("/Users/mlevental/dev_projects/loopy/llvm_install/lib/libMLIR-C.dylib")
    val allocator = SegmentAllocator.implicitAllocator()
    MemorySession.openConfined().use { memorySession ->
        val modStrRef = mlirStringRefCreate(memorySession, allocator, "module {}")
        val ctx = Bindings.mlirContextCreate(allocator)
        val mod = Bindings.mlirModuleCreateParse(allocator, ctx, modStrRef)
        val op = Bindings.mlirModuleGetOperation(allocator, mod)
        Bindings.mlirOperationDump(op)
    }
}

