// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class LLVMOrcCSymbolAliasMapEntry {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Name"),
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("GenericFlags"),
            Constants$root.C_CHAR$LAYOUT.withName("TargetFlags")
        ).withName("Flags"),
        MemoryLayout.paddingLayout(48)
    );
    public static MemoryLayout $LAYOUT() {
        return LLVMOrcCSymbolAliasMapEntry.$struct$LAYOUT;
    }
    static final VarHandle Name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Name"));
    public static VarHandle Name$VH() {
        return LLVMOrcCSymbolAliasMapEntry.Name$VH;
    }
    public static MemoryAddress Name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)LLVMOrcCSymbolAliasMapEntry.Name$VH.get(seg);
    }
    public static void Name$set( MemorySegment seg, MemoryAddress x) {
        LLVMOrcCSymbolAliasMapEntry.Name$VH.set(seg, x);
    }
    public static MemoryAddress Name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)LLVMOrcCSymbolAliasMapEntry.Name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Name$set(MemorySegment seg, long index, MemoryAddress x) {
        LLVMOrcCSymbolAliasMapEntry.Name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Flags$slice(MemorySegment seg) {
        return seg.asSlice(8, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


