REPORT z_student_report.

DATA: lt_students TYPE TABLE OF string,
      lv_name TYPE string.

APPEND 'Pedro' TO lt_students.
APPEND 'Ana' TO lt_students.

LOOP AT lt_students INTO lv_name.
  WRITE: / 'Estudiante:', lv_name.
ENDLOOP.

DATA: lt_students TYPE TABLE OF string,
      lv_name TYPE string.

APPEND 'Juan' TO lt_students.
APPEND 'María' TO lt_students.

LOOP AT lt_students INTO lv_name.
  WRITE: / lv_name.
ENDLOOP.

