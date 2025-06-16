function solution(number) {
    let total = 0;
    number.split('').forEach(e => {
        total += parseInt(e);
    })
    return total % 9;
}