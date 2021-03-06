/*
    1.  Recursion: Сколькими способами можно доссумировать до определенного числа используя 1 и 2.

        helper(int i, int n) {
            if (i > n) return 0;
            if (i == n) return 1;
            return helper(i+1, n) + helper(i+2, n);
        }

        Можно добавить memoization, создав array размера n+1

        helper(int i, int n, int[] memo) {
            if (i > n) return 0;
            if (i == n) return 1;
            if (memo[i] > 0) return memo[i];
            memo[i] = helper(i+1, n, memo) + helper(i+2, n, memo);
            return memo[i];
        }
        
    2. Recursion: часто можно легко понять алгоритм, нарисовав дерево    
    
    3.  Когда нужно постоянно менять числа внутри коллекции на другие (например 1 на 10, и 0 на 01),
        то создай HashMap c ключами 1 и 0, и потом доставай их занчения.

    4.  Tree + Recursion: 
        Когда мы делаем операцию seacrh или traverse, то мы возвращаем вызов функции. 
        НО, если мы делаем insertion или deletion, то мы приравниваем root/child к вызову функции.
    
    5. Searching: 
        - Когда поиск в матрице, то сравни нынешнее число с соседями либо с таргетом
        - Когда поиск в массиве, то сравнивай боковые поинтеры с центраьным и с тагретом

    6. Palindrome:
        - Palindrome is a string that is symmetrical with respect to its center, which 
          can either be a character (in the case of odd-length palindrome) 
          or an empty string (in the case of even-length palindromes).
          Thus, we can check the palindromaicity of a string by simply expanding
          from its center and making sure that characters on both sides are indeed mirrored.


    7. Two/Three number sum:
        1. Do 2+ loops
        2. Use HashTable to store the array once and do -1 loops and compare the target value to
            the key in table
        3. Sort array and use 2 or 3 pointers to iterate the array (i, left, right). The first
            is just iteration, then left = i+1 and right array.size() - 1, then increment or
            decrement the left and right pointers depending on wheter the sum of i, left and right
            greater or smaller than the target sum.
            
*/