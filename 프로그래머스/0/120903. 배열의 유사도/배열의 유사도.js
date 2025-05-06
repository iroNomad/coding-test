function solution(s1, s2) {
    let answer = s1.filter(e => s2.includes(e))
    return answer.length;
}