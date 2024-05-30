
Test Table


| TC  | Expected   | Actual     | Verdict    |
|-----|------------|------------|---------   |
| 1   | No error   | No error   | pass       |
| 2   | No error   | No error   | pass       |
| 3   | error      | error      | pass       |
| 4   | error      | error      | pass       |
| 5   | error      | error      | pass       |
| 6   | error      | error      | pass       |
| 7   | error      | error      | pass       |
| 8   | No error   | No error   | pass       |
| 9   | No error   | No error   | pass       |
| 10  | No error   | No error   | pass       |
| 11  | No error   | No error   | pass       |
| 12  | error      | error      | pass       |
| 13  | error      | error      | pass       |
| 14  | No error   | No error   | pass       |
| 15  | No error   | No error   | pass       |
| 16  | No error   | No error   | pass       |
| 17  | error      | error      | pass       |
| 18  | error      | error      | pass       |
| 19  | error      | error      | pass       |
| 20  | error      | error      | pass       |
| 21  | error      | error      | pass       |
| 22  | No error   | No error   | pass       |
| 23  | No error   | No error   | pass       |
| 24  | No error   | No error   | pass       |
| 25  | error      | error      | pass       |
| 26  | error      | error      | pass       |
| 27  | error      | error      | pass       |
| 28  | No error   | No error   | pass       |
| 29  | No error   | No error   | pass       |
| 30  | No error   | No error   | pass       |
| 31  | error      | error      | pass       |
| 32  | error      | error      | pass       |
| 33  | error      | error      | pass       |
| 34  | error      | error      | pass       |
| 35  | error      | error      | pass       |



Equivalence Classes:

TC1	Username	"z87878"	Valid\
TC2	Username	"Y8ud8y88qppqq"	Valid\
TC3	Username	""		Err2: UserName is mandatory\
TC4	Username	"q"		Err3: Size must be between 6 and 12\
TC5	Username	"e3333"	Err3: Size must be between 6 and 12\
TC6	Username	"2fn4t4"	Err1: Wrong UserName format\
TC7	Username	"W23*e3"	Err1: Wrong UserName format\
\
TC8	FirstName	""		Valid\
TC9	LastName	""		Valid\
TC10	FirstName	"Pamir"	Valid\
TC11	LastName	"Pamir"	Valid\
TC12	FirstName	"Pamir6"	Err4: Wrong FirstName format\
TC13	LastName	"Pamir7"	Err5: Wrong LastName format\
\
TC14	Email	"test.email@example.com"	Valid\
TC15	Email	"user_name@domain.co"	Valid\
TC16	Email	"user+name@sub-domain.com"	Valid\
TC17	Email	"test@com"	Err6: Wrong Email format\
TC18	Email	"test@domain"	Err6: Wrong Email format\
TC19	Email	"test@domain..com"	Err6: Wrong Email format\
TC20	Email	"test@domain!com"	Err6: Wrong Email format\
TC21	Email	""	Err7: An Email address is mandatory\
\
TC22	Age	18	Valid\
TC23	Age	25	Valid\
TC24	Age	64	Valid\
TC25	Age	17	Err9: must be greater than or equal to 18\
TC26	Age	65	Err10: must be less than or equal to 64\
TC27	Age	""	Err8: Age is mandatory\
\
TC28	PostalCode	"K4A0A1"	Valid\
TC29	PostalCode	"C2C3D4"	Valid\
TC30	PostalCode	"K4A 0A1"	Valid\
TC31	PostalCode	"K4A0B"	Err11: Wrong Postal Code format\
TC32	PostalCode	"K4A0B1A"	Err11: Wrong Postal Code format\
TC33	PostalCode	"D4A0B1"	Err11: Wrong Postal Code format\
TC34	PostalCode	"K4F0B1"	Err11: Wrong Postal Code format\
TC35	PostalCode	"K4A0B!"	Err11: Wrong Postal Code format\

