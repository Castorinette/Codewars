

char *create_phone_number(char phnum[15], const unsigned char nums[10])
{
    int index=0;

	phnum[0]= '(';
    for(int i = 1; i < 4; i++)
    {   
        phnum[i] = '0' +nums[index];
        index++;
    }
    phnum[4]= ')';
    phnum[5]= ' ';
    for(int j = 6; j < 9; j++){
        phnum[j] = '0' + nums[index];
        index++;
    }
    phnum[9]= '-';
    for(int k = 10; k < 14; k++){
        phnum[k]= '0' + nums[index];
        index++;
    }
    phnum[14] = '\0';
    
    return phnum;
}