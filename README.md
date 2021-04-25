# JpaMapping1

Unidrectional one to one & one to many relational mapping

table name - student
student_id - auto increment PK
first_name
last_name
contact_id - FK

table name - student_contact
contact_id - auto increment PK
address
email
mobile

table name - student courses
course_id - auto increment PK
student_id - FK
course_name
