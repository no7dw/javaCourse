without lock:

Thread[Thread-9,5,main]    745.65 from 9 to 81
Total Balance:   99623.53
Thread[Thread-96,5,main]    352.86 from 96 to 14
Total Balance:   99623.53
Thread[Thread-97,5,main]    776.31 from 97 to 10
Total Balance:   99623.53^C    760.10 from 36 to 56
    376.47 from 73 to 75
Total Balance:  100000.0

with lock:




坑in run after compile：

    java src/AsyncBankTest

instead of :
    
    java ./src/AsyncBankTest
