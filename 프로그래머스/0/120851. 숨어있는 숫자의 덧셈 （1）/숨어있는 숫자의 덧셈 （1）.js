function solution(my_string) {
    let answer = 0;
    my_string.split('').forEach(e => {
        if (!isNaN(e)) {
            answer += parseInt(e);
        }
    });
    return answer;
}