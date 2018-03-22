# homework2


public static long fibonacci(int n) {

 if (n < 2) return 1;

 return fibonacci(n-1) + fibonacci(n-2);
}

this code slow because when we call this method this method will call itself 2 times
like this

fibonacci(int n)
fibonacci(n-1) + fibonacci(n-2)
fibonacci(n-2) + fibonacci(n-3) + fibonacci(n-3) + fibonacci(n-4)

that why it slow.