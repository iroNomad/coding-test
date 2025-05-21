function solution(my_string) {
    let vowels = ['a', 'e', 'i', 'o', 'u']
    var answer = my_string.split('').filter(e => !vowels.includes(e)).join('')
    return answer;
}