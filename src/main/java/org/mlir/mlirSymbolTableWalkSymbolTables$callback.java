// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface mlirSymbolTableWalkSymbolTables$callback {

    void apply(java.lang.foreign.MemorySegment _x0, boolean _x1, java.lang.foreign.MemoryAddress _x2);
    static MemorySegment allocate(mlirSymbolTableWalkSymbolTables$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(mlirSymbolTableWalkSymbolTables$callback.class, fi, constants$30.mlirSymbolTableWalkSymbolTables$callback$FUNC, session);
    }
    static mlirSymbolTableWalkSymbolTables$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemorySegment __x0, boolean __x1, java.lang.foreign.MemoryAddress __x2) -> {
            try {
                constants$30.mlirSymbolTableWalkSymbolTables$callback$MH.invokeExact((Addressable)symbol, __x0, __x1, (java.lang.foreign.Addressable)__x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


