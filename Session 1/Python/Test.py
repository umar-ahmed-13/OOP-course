import math   

with open('salarysheet.csv','r') as file:

    maxName= None
    minName= None
    min = math.inf
    max = -math.inf
    avg = 0
    avgTotal= 0
    count= 0
    while True:
        count+=1
        line = file.readline()
        # print(type(line), end=" ")
        if not line:
            break
        avg+=1
        name, salary = line.split(',')
        salary = int(salary)
        avgTotal+=salary
        if salary< min:
            min= salary
            minName = name
        if salary> max:
            max= salary
            maxName = name

    print(f"Max salary is {maxName} with {max}")
    print(f'Min salary is {minName} with {min}')
    print(f"Average salary is {avgTotal/avg}")


