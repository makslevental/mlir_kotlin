// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class LLVMOrcCDependenceMapPair {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("JD"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("Symbols"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
        ).withName("Names")
    );
    public static MemoryLayout $LAYOUT() {
        return LLVMOrcCDependenceMapPair.$struct$LAYOUT;
    }
    static final VarHandle JD$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JD"));
    public static VarHandle JD$VH() {
        return LLVMOrcCDependenceMapPair.JD$VH;
    }
    public static MemoryAddress JD$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)LLVMOrcCDependenceMapPair.JD$VH.get(seg);
    }
    public static void JD$set( MemorySegment seg, MemoryAddress x) {
        LLVMOrcCDependenceMapPair.JD$VH.set(seg, x);
    }
    public static MemoryAddress JD$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)LLVMOrcCDependenceMapPair.JD$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JD$set(MemorySegment seg, long index, MemoryAddress x) {
        LLVMOrcCDependenceMapPair.JD$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Names$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


