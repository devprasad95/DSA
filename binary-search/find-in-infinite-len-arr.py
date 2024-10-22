def ans(arr, target):
    start = 0
    end = 1
    while arr[end] < target:
        temp = end
        end = end * 2
        start = temp + 1
    return binarySearch(arr, target, start, end)


def binarySearch(arr,target, start, end):
    while start <= end:
        mid = start + (end - start) // 2
        if arr[mid] == target:
            return mid
        elif target < arr[mid]:
            end = mid - 1
        else:
            start = mid + 1
    return -1

if __name__ == "__main__":
    arr = [1, 3, 5, 8, 10, 20, 25, 30, 40]
    target = 40
    print(len(arr))
    print(ans(arr, target))
