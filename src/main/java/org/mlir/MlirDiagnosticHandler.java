// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface MlirDiagnosticHandler {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemoryAddress userData);
    static MemorySegment allocate(MlirDiagnosticHandler fi, MemorySession session) {
        return RuntimeHelper.upcallStub(MlirDiagnosticHandler.class, fi, constants$270.MlirDiagnosticHandler$FUNC, session);
    }
    static MlirDiagnosticHandler ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemoryAddress _userData) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$270.MlirDiagnosticHandler$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)_userData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

