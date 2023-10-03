let rec positive_sum(l: int list):int = 
  match l with
  | [] -> 0
  | h :: t -> if (h>=0) then h + positive_sum t else positive_sum t

