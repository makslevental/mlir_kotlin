// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LLVMDiagnosticHandler {

    void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
    static MemorySegment allocate(LLVMDiagnosticHandler fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LLVMDiagnosticHandler.class, fi, constants$80.LLVMDiagnosticHandler$FUNC, session);
    }
    static LLVMDiagnosticHandler ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
            try {
                constants$80.LLVMDiagnosticHandler$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


