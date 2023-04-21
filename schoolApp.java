package cm4school;

public class schoolApp {
	public static void main(String[] args) {
		Year year2011 = new Year();
		year2011.id = 1;
		year2011.name = "2011";

		Year year2012 = new Year();
		year2012.id = 2;
		year2012.name = "2012";

		Year[] years = { year2011, year2012 };

		Semester sem1Year2011 = new Semester();
		sem1Year2011.id = 1;
		sem1Year2011.name = "HK1";
		sem1Year2011.multiplication = 1;
		sem1Year2011.year = year2011;

		Semester sem2Year2011 = new Semester();
		sem2Year2011.id = 2;
		sem2Year2011.name = "HK2";
		sem2Year2011.multiplication = 2;
		sem2Year2011.year = year2011;

		Semester sem1Year2012 = new Semester();
		sem1Year2012.id = 3;
		sem1Year2012.name = "HK1";
		sem1Year2012.multiplication = 1;
		sem1Year2012.year = year2012;

		Semester sem2Year2012 = new Semester();
		sem2Year2012.id = 4;
		sem2Year2012.name = "HK2";
		sem2Year2012.multiplication = 2;
		sem2Year2012.year = year2012;

		Semester[] semesters = { sem1Year2011, sem2Year2011, sem1Year2012, sem2Year2012 };

		Teacher teacherDung = new Teacher();
		teacherDung.id = 1;
		teacherDung.name = "Dung Triu Men";

		Teacher teacherTri = new Teacher();
		teacherTri.id = 2;
		teacherTri.name = "Tri Den Si";

		Room room1 = new Room();
		room1.id = 1;
		room1.name = "Phong 1 Khu 1";

		Clazz clazz10A1 = new Clazz();
		clazz10A1.id = 1;
		clazz10A1.name = "10A1";
		clazz10A1.locatedRoom = room1;
		clazz10A1.primaryTeacher = teacherDung;

		Clazz clazz10A2 = new Clazz();
		clazz10A2.id = 2;
		clazz10A2.name = "10A2";
		clazz10A2.locatedRoom = room1;
		clazz10A2.primaryTeacher = teacherTri;

		Clazz[] clazzs = { clazz10A1, clazz10A2 };

		Student studentNghi = new Student();
		studentNghi.id = 1;
		studentNghi.name = "Anh Nghi";
		studentNghi.studyingClazz = clazz10A1;

		Student[] students = { studentNghi };

		Subject subjectMath = new Subject();
		subjectMath.id = 1;
		subjectMath.name = "Toan";
		subjectMath.multiplication = 2;

		Subject subjectHistory = new Subject();
		subjectHistory.id = 2;
		subjectHistory.name = "Su";
		subjectHistory.multiplication = 1;

		Subject[] subjects = { subjectMath, subjectHistory };

		TeacherKnowledge dungTeachMath = new TeacherKnowledge();
		dungTeachMath.teacher = teacherDung;
		dungTeachMath.teachingSubject = subjectMath;

		TeacherKnowledge dungTeachHis = new TeacherKnowledge();
		dungTeachMath.teacher = teacherTri;
		dungTeachMath.teachingSubject = subjectHistory;

		TeacherKnowledge triTeachHis = new TeacherKnowledge();
		triTeachHis.teacher = teacherTri;
		triTeachHis.teachingSubject = subjectHistory;

		TeacherKnowledge[] teacherKnowledges = { dungTeachMath, dungTeachHis, triTeachHis };

		Exam examMidSem1Year2011Math = new Exam();
		examMidSem1Year2011Math.id = 1;
		examMidSem1Year2011Math.name = "Kiem tra giua ki 1 mon Toan";
		examMidSem1Year2011Math.semester = sem1Year2011;
		examMidSem1Year2011Math.subject = subjectMath;
		examMidSem1Year2011Math.multiplication = 1;

		Exam examFinalSem1Year2011Math = new Exam();
		examFinalSem1Year2011Math.id = 2;
		examFinalSem1Year2011Math.name = "Kiem tra cuoi ki 1 mon Toan";
		examFinalSem1Year2011Math.semester = sem1Year2011;
		examFinalSem1Year2011Math.subject = subjectMath;
		examFinalSem1Year2011Math.multiplication = 2;

		Exam examFinalSem1Year2011His = new Exam();
		examFinalSem1Year2011His.id = 3;
		examFinalSem1Year2011His.name = "Kiem tra cuoi ki 1 mon Su";
		examFinalSem1Year2011His.semester = sem1Year2011;
		examFinalSem1Year2011His.subject = subjectHistory;
		examFinalSem1Year2011His.multiplication = 2;

		Exam examMidSem2Year2011Math = new Exam();
		examMidSem2Year2011Math.id = 4;
		examMidSem2Year2011Math.name = "Kiem tra giua ki 2 mon Toan";
		examMidSem2Year2011Math.semester = sem2Year2011;
		examMidSem2Year2011Math.subject = subjectMath;
		examMidSem2Year2011Math.multiplication = 1;

		Exam examFinalSem2Year2011Math = new Exam();
		examFinalSem2Year2011Math.id = 5;
		examFinalSem2Year2011Math.name = "Kiem tra cuoi ki 2 mon Toan";
		examFinalSem2Year2011Math.semester = sem2Year2011;
		examFinalSem2Year2011Math.subject = subjectMath;
		examFinalSem2Year2011Math.multiplication = 2;

		Exam examFinalSem2Year2011His = new Exam();
		examFinalSem2Year2011His.id = 6;
		examFinalSem2Year2011His.name = "Kiem tra cuoi ki 2 mon Su";
		examFinalSem2Year2011His.semester = sem2Year2011;
		examFinalSem2Year2011His.subject = subjectHistory;
		examFinalSem2Year2011His.multiplication = 2;

		Exam examMidSem1Year2012Math = new Exam();
		examMidSem1Year2012Math.id = 7;
		examMidSem1Year2012Math.name = "Kiem tra giua ki 1 mon Toan";
		examMidSem1Year2012Math.semester = sem1Year2012;
		examMidSem1Year2012Math.subject = subjectMath;
		examMidSem1Year2012Math.multiplication = 1;

		Exam examFinalSem1Year2012Math = new Exam();
		examFinalSem1Year2012Math.id = 8;
		examFinalSem1Year2012Math.name = "Kiem tra cuoi ki 1 mon Toan";
		examFinalSem1Year2012Math.semester = sem1Year2012;
		examFinalSem1Year2012Math.subject = subjectMath;
		examFinalSem1Year2012Math.multiplication = 2;

		Exam examFinalSem1Year2012His = new Exam();
		examFinalSem1Year2012His.id = 9;
		examFinalSem1Year2012His.name = "Kiem tra cuoi ki 1 mon Su";
		examFinalSem1Year2012His.semester = sem1Year2012;
		examFinalSem1Year2012His.subject = subjectHistory;
		examFinalSem1Year2012His.multiplication = 2;

		Exam examMidSem2Year2012Math = new Exam();
		examMidSem2Year2012Math.id = 10;
		examMidSem2Year2012Math.name = "Kiem tra giua ki 2 mon Toan";
		examMidSem2Year2012Math.semester = sem2Year2012;
		examMidSem2Year2012Math.subject = subjectMath;
		examMidSem2Year2012Math.multiplication = 1;

		Exam examFinalSem2Year2012Math = new Exam();
		examFinalSem2Year2012Math.id = 11;
		examFinalSem2Year2012Math.name = "Kiem tra cuoi ki 2 mon Toan";
		examFinalSem2Year2012Math.semester = sem2Year2012;
		examFinalSem2Year2012Math.subject = subjectMath;
		examFinalSem2Year2012Math.multiplication = 2;

		Exam examFinalSem2Year2012His = new Exam();
		examFinalSem2Year2012His.id = 12;
		examFinalSem2Year2012His.name = "Kiem tra cuoi ki 2 mon Su";
		examFinalSem2Year2012His.semester = sem2Year2012;
		examFinalSem2Year2012His.subject = subjectHistory;
		examFinalSem2Year2012His.multiplication = 2;

		Exam[] exams = { examMidSem1Year2011Math, examFinalSem1Year2011Math, examFinalSem1Year2011His,
				examMidSem2Year2011Math, examFinalSem2Year2011Math, examFinalSem2Year2011His, examMidSem1Year2012Math,
				examFinalSem1Year2012Math, examFinalSem1Year2012His, examMidSem2Year2012Math, examFinalSem2Year2012Math,
				examFinalSem2Year2012His };

		Point point1 = new Point();
		point1.student = studentNghi;
		point1.exam = examMidSem1Year2011Math;
		point1.value = 10;

		Point point2 = new Point();
		point2.student = studentNghi;
		point2.exam = examFinalSem1Year2011Math;
		point2.value = 8;

		Point point3 = new Point();
		point3.student = studentNghi;
		point3.exam = examFinalSem1Year2011His;
		point3.value = 9;

		Point point4 = new Point();
		point4.student = studentNghi;
		point4.exam = examMidSem2Year2011Math;
		point4.value = 7;

		Point point5 = new Point();
		point5.student = studentNghi;
		point5.exam = examFinalSem2Year2011Math;
		point5.value = 9;

		Point point6 = new Point();
		point6.student = studentNghi;
		point6.exam = examFinalSem2Year2011His;
		point6.value = 8;

		Point point7 = new Point();
		point7.student = studentNghi;
		point7.exam = examMidSem1Year2012Math;
		point7.value = 7;

		Point point8 = new Point();
		point8.student = studentNghi;
		point8.exam = examFinalSem1Year2012Math;
		point8.value = 9;

		Point point9 = new Point();
		point9.student = studentNghi;
		point9.exam = examFinalSem1Year2012His;
		point9.value = 8;

		Point point10 = new Point();
		point10.student = studentNghi;
		point10.exam = examMidSem2Year2012Math;
		point10.value = 8;

		Point point11 = new Point();
		point11.student = studentNghi;
		point11.exam = examFinalSem2Year2012Math;
		point11.value = 9;

		Point point12 = new Point();
		point12.student = studentNghi;
		point12.exam = examFinalSem2Year2012His;
		point12.value = 9;

		Point[] points = { point1, point2, point3, point4, point5, point6, point7, point8, point9, point10, point11,
				point12 };

		for (Student student : students) {
			System.out.println("Name : " + student.name);
			System.out.println("Class : " + student.studyingClazz.name);
			System.out.println("Primary Teacher : " + student.studyingClazz.primaryTeacher.name);
			System.out.println("---------------------");

			for (Year year : years) {

				System.out.println("Year : " + year.name);
				double averagePointYear = 0;
				double totalPointSemester = 0;
				double toltalMultiplicationSemester = 0;

				for (Semester semester : semesters) {
					double averagePointSemester = 0;
					double totalPointSubject = 0;
					double toltalMultiplicationSubject = 0;
					if (semester.year.id == year.id) {
						System.out.println("Semester : " + semester.name);
						System.out.println("");

						for (Subject subject : subjects) {

							double averagePointSubject = 0;
							double totalPointExam = 0;
							double totalMultiplicationExam = 0;
							System.out.println("Subject : " + subject.name);

							for (Exam exam : exams) {
								if (exam.subject == subject && exam.semester == semester) {
									totalMultiplicationExam += exam.multiplication;

									for (Point point : points) {
										if (point.exam.id == exam.id && point.student == student) {
											System.out.println(exam.name + " --- Point : " + point.value);
											totalPointExam += point.value * point.exam.multiplication;

										}

									}

								}

							}
							averagePointSubject = totalPointExam / totalMultiplicationExam;
							System.out.println("Average Point : " + Math.round(averagePointSubject * 100.0) / 100.0);
							System.out.println("");
							toltalMultiplicationSubject += subject.multiplication;
							totalPointSubject += averagePointSubject * subject.multiplication;

						}
						averagePointSemester = totalPointSubject / toltalMultiplicationSubject;
						System.out.println(
								"Average of all subjects :" + Math.round(averagePointSemester * 100.0) / 100.0);
						System.out.println("----------------------");
						toltalMultiplicationSemester += semester.multiplication;
						totalPointSemester += averagePointSemester * semester.multiplication;

					}
				}

				averagePointYear = totalPointSemester / toltalMultiplicationSemester;
				System.out.println("Average of year : " + Math.round(averagePointYear * 100.0) / 100.0);
				System.out.println("--------------------------------------------------------------");

			}
		}
	}
}
