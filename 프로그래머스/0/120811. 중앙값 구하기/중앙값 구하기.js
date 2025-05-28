function solution(array) {
    array.sort((a, b) => a - b);
    let middle = Math.floor(array.length / 2);
    return array[middle];
}