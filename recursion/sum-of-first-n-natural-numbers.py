def parameterized(sum, i):
    if i == 0:
        print(sum)
        return
    parameterized(sum + i, i - 1)

def fn(n):
    if n == 0:
        return 0
    return n + fn(n - 1)

if __name__ == "__main__":
    # Testing the functions
    parameterized(0, 5)
    print(fn(5))
