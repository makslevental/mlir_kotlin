// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class MlirOpPassManager {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirOpPassManager");
    public static MemoryLayout $LAYOUT() {
        return MlirOpPassManager.$struct$LAYOUT;
    }
    static final VarHandle ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ptr"));
    public static VarHandle ptr$VH() {
        return MlirOpPassManager.ptr$VH;
    }
    public static MemoryAddress ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)MlirOpPassManager.ptr$VH.get(seg);
    }
    public static void ptr$set( MemorySegment seg, MemoryAddress x) {
        MlirOpPassManager.ptr$VH.set(seg, x);
    }
    public static MemoryAddress ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)MlirOpPassManager.ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        MlirOpPassManager.ptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


