function solution(myString, pat) {
    let str = myString.toLowerCase();
    return str.includes(pat.toLowerCase()) ? 1 : 0;
}