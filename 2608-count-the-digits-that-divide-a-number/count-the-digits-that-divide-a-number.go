func countDigits(num int) int {
    x := num
    cnt := 0
    for num > 0{
        d := num % 10
        if x % d == 0{
            cnt++
        }
        num /= 10
    }
    return cnt
}