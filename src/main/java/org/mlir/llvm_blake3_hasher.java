// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class llvm_blake3_hasher {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, Constants$root.C_INT$LAYOUT).withName("key"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, Constants$root.C_INT$LAYOUT).withName("cv"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("chunk_counter"),
            MemoryLayout.sequenceLayout(64, Constants$root.C_CHAR$LAYOUT).withName("buf"),
            Constants$root.C_CHAR$LAYOUT.withName("buf_len"),
            Constants$root.C_CHAR$LAYOUT.withName("blocks_compressed"),
            Constants$root.C_CHAR$LAYOUT.withName("flags"),
            MemoryLayout.paddingLayout(40)
        ).withName("chunk"),
        Constants$root.C_CHAR$LAYOUT.withName("cv_stack_len"),
        MemoryLayout.sequenceLayout(1760, Constants$root.C_CHAR$LAYOUT).withName("cv_stack"),
        MemoryLayout.paddingLayout(56)
    );
    public static MemoryLayout $LAYOUT() {
        return llvm_blake3_hasher.$struct$LAYOUT;
    }
    public static MemorySegment key$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static MemorySegment chunk$slice(MemorySegment seg) {
        return seg.asSlice(32, 112);
    }
    static final VarHandle cv_stack_len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cv_stack_len"));
    public static VarHandle cv_stack_len$VH() {
        return llvm_blake3_hasher.cv_stack_len$VH;
    }
    public static byte cv_stack_len$get(MemorySegment seg) {
        return (byte)llvm_blake3_hasher.cv_stack_len$VH.get(seg);
    }
    public static void cv_stack_len$set( MemorySegment seg, byte x) {
        llvm_blake3_hasher.cv_stack_len$VH.set(seg, x);
    }
    public static byte cv_stack_len$get(MemorySegment seg, long index) {
        return (byte)llvm_blake3_hasher.cv_stack_len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cv_stack_len$set(MemorySegment seg, long index, byte x) {
        llvm_blake3_hasher.cv_stack_len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cv_stack$slice(MemorySegment seg) {
        return seg.asSlice(145, 1760);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


