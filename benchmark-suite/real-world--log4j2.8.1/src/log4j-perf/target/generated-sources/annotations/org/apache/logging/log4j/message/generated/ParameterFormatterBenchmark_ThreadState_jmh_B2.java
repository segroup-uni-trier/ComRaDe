package org.apache.logging.log4j.message.generated;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class ParameterFormatterBenchmark_ThreadState_jmh_B2 extends ParameterFormatterBenchmark_ThreadState_jmh_B1 {
    public volatile int setupTrialMutex;
    public volatile int tearTrialMutex;
    public final static AtomicIntegerFieldUpdater setupTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(ParameterFormatterBenchmark_ThreadState_jmh_B2.class, "setupTrialMutex");
    public final static AtomicIntegerFieldUpdater tearTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(ParameterFormatterBenchmark_ThreadState_jmh_B2.class, "tearTrialMutex");

    public volatile int setupIterationMutex;
    public volatile int tearIterationMutex;
    public final static AtomicIntegerFieldUpdater setupIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(ParameterFormatterBenchmark_ThreadState_jmh_B2.class, "setupIterationMutex");
    public final static AtomicIntegerFieldUpdater tearIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(ParameterFormatterBenchmark_ThreadState_jmh_B2.class, "tearIterationMutex");

    public volatile int setupInvocationMutex;
    public volatile int tearInvocationMutex;
    public final static AtomicIntegerFieldUpdater setupInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(ParameterFormatterBenchmark_ThreadState_jmh_B2.class, "setupInvocationMutex");
    public final static AtomicIntegerFieldUpdater tearInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(ParameterFormatterBenchmark_ThreadState_jmh_B2.class, "tearInvocationMutex");

    public boolean readyTrial;
    public boolean readyIteration;
    public boolean readyInvocation;
}
