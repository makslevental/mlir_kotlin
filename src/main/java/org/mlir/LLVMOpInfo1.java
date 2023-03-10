// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class LLVMOpInfo1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Present"),
            Constants$root.C_POINTER$LAYOUT.withName("Name"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Value")
        ).withName("AddSymbol"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Present"),
            Constants$root.C_POINTER$LAYOUT.withName("Name"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Value")
        ).withName("SubtractSymbol"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Value"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("VariantKind")
    ).withName("LLVMOpInfo1");
    public static MemoryLayout $LAYOUT() {
        return LLVMOpInfo1.$struct$LAYOUT;
    }
    public static MemorySegment AddSymbol$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment SubtractSymbol$slice(MemorySegment seg) {
        return seg.asSlice(24, 24);
    }
    static final VarHandle Value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Value"));
    public static VarHandle Value$VH() {
        return LLVMOpInfo1.Value$VH;
    }
    public static long Value$get(MemorySegment seg) {
        return (long)LLVMOpInfo1.Value$VH.get(seg);
    }
    public static void Value$set( MemorySegment seg, long x) {
        LLVMOpInfo1.Value$VH.set(seg, x);
    }
    public static long Value$get(MemorySegment seg, long index) {
        return (long)LLVMOpInfo1.Value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, long x) {
        LLVMOpInfo1.Value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VariantKind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VariantKind"));
    public static VarHandle VariantKind$VH() {
        return LLVMOpInfo1.VariantKind$VH;
    }
    public static long VariantKind$get(MemorySegment seg) {
        return (long)LLVMOpInfo1.VariantKind$VH.get(seg);
    }
    public static void VariantKind$set( MemorySegment seg, long x) {
        LLVMOpInfo1.VariantKind$VH.set(seg, x);
    }
    public static long VariantKind$get(MemorySegment seg, long index) {
        return (long)LLVMOpInfo1.VariantKind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VariantKind$set(MemorySegment seg, long index, long x) {
        LLVMOpInfo1.VariantKind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


