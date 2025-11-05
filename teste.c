#include <stdio.h>;

int main(){
    int a;
    printf("digite um numero: ");
    scanf("%d",&a);
    if(a % 2){
        if(a < 50){
            printf("SIM");
        }else{
            printf("nao");
        }
    }else{
        if(a > 10){
        printf("SIM");
        }else{
            printf("nao");
        }
    }



}
