function solution(my_string, n) {
    var answer = '';
    let count;
    my_string.split('').forEach(
        e => {
            count = n
            while (count > 0) {
                answer += e;
                count--;
            }
        }
    )
    return answer;
}