char* create_phone_number(char phnum[15], const unsigned char n[10]) {
    sprintf(phnum, "(%d%d%d) %d%d%d-%d%d%d%d",
        n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7], n[8], n[9]);
    return phnum;
}
