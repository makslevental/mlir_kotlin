// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class llvm_blake3_chunk_state {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, Constants$root.C_INT$LAYOUT).withName("cv"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("chunk_counter"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_CHAR$LAYOUT).withName("buf"),
        Constants$root.C_CHAR$LAYOUT.withName("buf_len"),
        Constants$root.C_CHAR$LAYOUT.withName("blocks_compressed"),
        Constants$root.C_CHAR$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(40)
    );
    public static MemoryLayout $LAYOUT() {
        return llvm_blake3_chunk_state.$struct$LAYOUT;
    }
    public static MemorySegment cv$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle chunk_counter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chunk_counter"));
    public static VarHandle chunk_counter$VH() {
        return llvm_blake3_chunk_state.chunk_counter$VH;
    }
    public static long chunk_counter$get(MemorySegment seg) {
        return (long)llvm_blake3_chunk_state.chunk_counter$VH.get(seg);
    }
    public static void chunk_counter$set( MemorySegment seg, long x) {
        llvm_blake3_chunk_state.chunk_counter$VH.set(seg, x);
    }
    public static long chunk_counter$get(MemorySegment seg, long index) {
        return (long)llvm_blake3_chunk_state.chunk_counter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chunk_counter$set(MemorySegment seg, long index, long x) {
        llvm_blake3_chunk_state.chunk_counter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment buf$slice(MemorySegment seg) {
        return seg.asSlice(40, 64);
    }
    static final VarHandle buf_len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("buf_len"));
    public static VarHandle buf_len$VH() {
        return llvm_blake3_chunk_state.buf_len$VH;
    }
    public static byte buf_len$get(MemorySegment seg) {
        return (byte)llvm_blake3_chunk_state.buf_len$VH.get(seg);
    }
    public static void buf_len$set( MemorySegment seg, byte x) {
        llvm_blake3_chunk_state.buf_len$VH.set(seg, x);
    }
    public static byte buf_len$get(MemorySegment seg, long index) {
        return (byte)llvm_blake3_chunk_state.buf_len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_len$set(MemorySegment seg, long index, byte x) {
        llvm_blake3_chunk_state.buf_len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blocks_compressed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blocks_compressed"));
    public static VarHandle blocks_compressed$VH() {
        return llvm_blake3_chunk_state.blocks_compressed$VH;
    }
    public static byte blocks_compressed$get(MemorySegment seg) {
        return (byte)llvm_blake3_chunk_state.blocks_compressed$VH.get(seg);
    }
    public static void blocks_compressed$set( MemorySegment seg, byte x) {
        llvm_blake3_chunk_state.blocks_compressed$VH.set(seg, x);
    }
    public static byte blocks_compressed$get(MemorySegment seg, long index) {
        return (byte)llvm_blake3_chunk_state.blocks_compressed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blocks_compressed$set(MemorySegment seg, long index, byte x) {
        llvm_blake3_chunk_state.blocks_compressed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return llvm_blake3_chunk_state.flags$VH;
    }
    public static byte flags$get(MemorySegment seg) {
        return (byte)llvm_blake3_chunk_state.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, byte x) {
        llvm_blake3_chunk_state.flags$VH.set(seg, x);
    }
    public static byte flags$get(MemorySegment seg, long index) {
        return (byte)llvm_blake3_chunk_state.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, byte x) {
        llvm_blake3_chunk_state.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


