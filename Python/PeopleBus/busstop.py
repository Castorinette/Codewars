def number(bus_stops):
    
    nb_pers = 0

    for i in range(len(bus_stops)):
        nb_pers += bus_stops[i][0] - bus_stops[i][1] 
    return nb_pers
