// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface mlirAffineMapCompressUnusedSymbols$populateResult {

    void apply(java.lang.foreign.MemoryAddress _x0, long _x1, java.lang.foreign.MemorySegment _x2);
    static MemorySegment allocate(mlirAffineMapCompressUnusedSymbols$populateResult fi, MemorySession session) {
        return RuntimeHelper.upcallStub(mlirAffineMapCompressUnusedSymbols$populateResult.class, fi, constants$53.mlirAffineMapCompressUnusedSymbols$populateResult$FUNC, session);
    }
    static mlirAffineMapCompressUnusedSymbols$populateResult ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, long __x1, java.lang.foreign.MemorySegment __x2) -> {
            try {
                constants$54.mlirAffineMapCompressUnusedSymbols$populateResult$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

