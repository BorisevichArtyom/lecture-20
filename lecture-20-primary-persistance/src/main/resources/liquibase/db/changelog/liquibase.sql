insert into Exercises(name)
            values ( 'Pull ups'),( 'Push ups'),( 'Bench press'),( 'Raising dumbells'),( 'Deadlift'),( 'Squats');
insert into User_roles(user_id,user_role_name)
            values (2, 'Coach'),(3, 'Admin'),(1, 'Athlete');
insert into Muscles(muscle_id,muscle_name)
                values (1,'Trycep'),(2,'Bycep'),(3,'Calves'),(4,'Upper back'),(5,'Abdominals'),(6,'Chest');
insert into Diary_users(user_id,email,user_password,first_name,last_name,age,weight,balance_amount)
                values (1,'grb@tut.by', 'Bicep','Denis', 'Samusenko',20,70,100),(2,'321@tut.by', 'www','Artuom', 'Samusenko',25,75,200),
                (3,'7891@tut.by', 'ppp','Sergei', 'Spiridonov',50,100,200),(4,'7891eddh1@tut.by', 'ddd','Sergei', 'Borisevich',60,78,200);
insert into Trainings(training_id,training_date,user_id)
            values(1,'28.10.2021',1),(2,'24.10.2021',2),
            (3,'24.10.2021',3),(4,'22.10.2021',1);
insert into Approaches(training_id,name_exercises_id,approach_counter,time,weight,repeats)
            values (2, 1,1,'00:02:01', 50, 10),(2, 2,1,'00:02:01', 40, 12),(3, 1,1,'00:02:01', 60, 13),
            (1, 4,3,'00:02:01', 50, 10),(3, 5,4,'00:02:01', 80, 18);
insert into Muscles_x_Exercises values (1,2),(1,4);