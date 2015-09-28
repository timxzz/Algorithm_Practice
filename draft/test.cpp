#include <stdio.h>

int main() {
  int N;
  int a, b;
  scanf("%d", &N);
  while(N--) {
    scanf("%d%d", &a, &b);
    printf("%d\n", a+b);
  }
}
