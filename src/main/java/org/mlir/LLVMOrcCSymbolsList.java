// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class LLVMOrcCSymbolsList {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Symbols"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
    );
    public static MemoryLayout $LAYOUT() {
        return LLVMOrcCSymbolsList.$struct$LAYOUT;
    }
    static final VarHandle Symbols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Symbols"));
    public static VarHandle Symbols$VH() {
        return LLVMOrcCSymbolsList.Symbols$VH;
    }
    public static MemoryAddress Symbols$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)LLVMOrcCSymbolsList.Symbols$VH.get(seg);
    }
    public static void Symbols$set( MemorySegment seg, MemoryAddress x) {
        LLVMOrcCSymbolsList.Symbols$VH.set(seg, x);
    }
    public static MemoryAddress Symbols$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)LLVMOrcCSymbolsList.Symbols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Symbols$set(MemorySegment seg, long index, MemoryAddress x) {
        LLVMOrcCSymbolsList.Symbols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return LLVMOrcCSymbolsList.Length$VH;
    }
    public static long Length$get(MemorySegment seg) {
        return (long)LLVMOrcCSymbolsList.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, long x) {
        LLVMOrcCSymbolsList.Length$VH.set(seg, x);
    }
    public static long Length$get(MemorySegment seg, long index) {
        return (long)LLVMOrcCSymbolsList.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, long x) {
        LLVMOrcCSymbolsList.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

