This C program is a simple calculator that can add, subtract, multiply, and divide two numbers. It uses functions to perform each operation, and handles division by zero.
#include <stdio.h>

void add(int *a, int *b, int *result) {
    *result = *a + *b;
}

void subtract(int *a, int *b, int *result) {
    *result = *a - *b;
}

void multiply(int *a, int *b, int *result) {
    *result = *a * *b;
}

void divide(int *a, int *b, int *result) {
    if (*b != 0) {
        *result = *a / *b;
    } else {
        printf("Error: Division by zero\n");
    }
}

int main() {
    int num1, num2, result;
    char operator;

    printf("Enter first number: ");
    scanf("%d", &num1);

    printf("Enter an operator (+, -, *, /): ");
    scanf(" %c", &operator); // Add a space before %c to ignore whitespace

    printf("Enter second number: ");
    scanf("%d", &num2);

    switch (operator) {
        case '+':
            add(&num1, &num2, &result);
            printf("Result: %d\n", result);
            break;
        case '-':
            subtract(&num1, &num2, &result);
            printf("Result: %d\n", result);
            break;
        case '*':
            multiply(&num1, &num2, &result);
            printf("Result: %d\n", result);
            break;
        case '/':
            divide(&num1, &num2, &result);
            if (num2 != 0) {
                printf("Result: %d\n", result);
            }
            break;
        default:
            printf("Invalid operator\n");
            break;
    }

    return 0;
}
