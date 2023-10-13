int calculate_damage(const char *your_type, const char *opponent_type, int attack, int defense) {
  if (*your_type == *opponent_type) return 50*(attack/defense)/2;
  float effectiveness; 
  switch (*your_type) {
    case 'e': effectiveness = (*opponent_type == 'f') || (*opponent_type == 'g') ? 1 : 2; break;
    case 'w': effectiveness = (*opponent_type == 'e') || (*opponent_type == 'g') ? 0.5 : 2; break;
    case 'f': effectiveness = (*opponent_type == 'e') ? 1 : ((*opponent_type == 'w') ? 0.5 : 2); break;
    case 'g': effectiveness = (*opponent_type == 'e') ? 1 : ((*opponent_type == 'w') ? 2 : 0.5); break;
  }
   return 50*(attack/defense)*effectiveness;
}
