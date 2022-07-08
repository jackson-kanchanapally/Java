<p>
    Used to maximize the CPU utilization.
    We don't want our CPU to be in a free state; for example, Func1() comes into the memory and demands any input/output process. The CPU will need to wait for unit Func1() to complete its input/output operation in such a condition. But, while Func1() completes its I/O operation, the CPU is free and not executing any thread. So, the efficiency of the CPU is decreased in the absence of multithreading.
    In the case of multithreading, if a thread demands any I/O operation, then the CPU will let the thread perform its I/O operation, but it will start the execution of a new thread parallelly. So, in this case, two threads are executing at the same time.
</p>
[Process/Function without Thread](https://documents.lucid.app/documents/47c6efde-c63f-479b-b598-bdb66bfa1680/pages/0_0?a=235&x=161&y=215&w=858&h=110&store=1&accept=image%2F*&auth=LCA%20b1db60038ae9122c72af67540db42ab44a38f04b-ts%3D1619250659)


[And with Thread](https://documents.lucid.app/documents/47c6efde-c63f-479b-b598-bdb66bfa1680/pages/0_0?a=274&x=191&y=347&w=638&h=286&store=1&accept=image%2F*&auth=LCA%20585d16e605241f65bbf65594c2574a9a75764fd9-ts%3D1619250659)