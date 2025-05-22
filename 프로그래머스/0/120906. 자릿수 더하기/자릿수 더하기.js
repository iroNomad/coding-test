function solution(n) {
    let answer = 0;
    while (n >= 1) {
        let digit = n % 10;
        answer += digit;
        n = Math.floor(n/10);
    }
    return answer;
}