/******************************************************************************

I did the problem in C because it seemed the most apprpriate as it is only about string operations.


*******************************************************************************/

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int minimumNumber( char* password) {
    int lowLetters = 0; //first we initialize a counter for every required type of character
    int upperLetters = 0;
    int nrs = 0; //in C there is no Bool type so I used counters
    int triplicate=0; // we have to count how many triplicates will be deleted
    int len = strlen(password);
    int lenFinal; //we have to check the size of the password AFTER the changes
    int addCharacter = 0; //counter for how many characters have been added
    int nrChanges=0; //counter for nr of changes
    for(int i = 0; i<len; i++)
    {
        
        if(password[i] >= 'a' && password[i] <= 'z')
            lowLetters++;
        else if(password[i] >= 'A' && password[i] <= 'Z')
            upperLetters++;
        else if(password[i] >= '0' && password[i] <= '9')
            nrs++;
        if(password[i]==password[i+1]&&password[i+1]==password[i+2])
            triplicate++;
        
    }
    
    if(lowLetters == 0)
        addCharacter++; //check if it has lower letters, otherwise 1 change has to be made
    if(upperLetters == 0)
        addCharacter++; //check if it has upper letters, otherwise, 1 more change has to be made
    if(nrs == 0)
        addCharacter++; //check if it has numbers letters, otherwise, 1 more change has to be made
    
    lenFinal = len + addCharacter -triplicate; //calculate the length AFTER the changes
    nrChanges=addCharacter+triplicate; //nr changes if the size of the password is in range 6-20
    
    if(lenFinal < 6)
        nrChanges=addCharacter+triplicate + 6 -lenFinal;
    if(lenFinal>20)
        nrChanges=addCharacter+triplicate -20 +lenFinal;
    
    //calculate the nr of changes if the size of the password is not in range 6-20
    
    return nrChanges;
}
int main() {
    char* password = (char *)malloc(1000 * sizeof(char)); //dynamic memory allocation for the password
    scanf("%s", password);
    printf("%d\n", minimumNumber(password)); //I/O
    return 0;
}