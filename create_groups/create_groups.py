# author: Mwiza Chiwale
# date: 15/03/2023
# description: This program randomly assigns students in the programming
# languages and paradgms class to groups of 6 people each.
# please pip install 'pandas' and 'xlswriter' to run the program. 
# THANK YOU

import math
import pandas as pd
students = pd.read_csv("student_list.csv")
file_name = "generatedgroups7.xlsx" # name of the file to save the group lists in
student_data = students[["Full name", "Computer number"]] # get only the necessary columns

# shuffle the rows
shuffled_student_data = student_data.sample(frac=1).reset_index()

## convert the data frame to a dictionary
shuffled_student_data = shuffled_student_data.to_dict()

number_of_students = len(shuffled_student_data["Full name"])
students_per_group = 6
number_of_groups = math.ceil(number_of_students/students_per_group)

group_data = {} # stores the students in a group
i = 0
count = 0 # keep track of current row number in shuffled_student_data

# create writer object to enable editing the excel sheet
writer = pd.ExcelWriter(file_name, engine='xlsxwriter')
print(number_of_groups)
while i < number_of_groups:
    col_name = f"Group_{i+1}"
    k = 0
    temp = {} # store temporal entries
    
    while k < 6:
        if count < number_of_students:
            temp[k] = {shuffled_student_data['Full name'][count], shuffled_student_data['Computer number'][count]}
            k += 1
            count += 1
        else:
            break

    group_data[col_name] = temp
    group_data_frame =  pd.DataFrame(group_data) # convert to dataframe
    # create new sheet for each group
    group_data_frame[col_name].to_excel(writer, sheet_name=col_name, index=False) 
    i += 1

writer.save() # save excel sheet
