def get_button_layout(button_id):
    return f"<Button android:id=\"@+id/{button_id}\" android:layout_width=\"match_parent\" android:layout_height=\"wrap_content\"/>"

def get_binding_templates(button_id, class_name):
    return f"binding.{button_id}.setOnClickListener(v1 -> {{]\n\tIntent i = new Intent(getApplicationContext(), {class_name}.class);\n\tstartActivity(i);\n}});\n"

def get_layout_placeholder():
    return "<!-- (( button_layout )) -->"

def get_button_placeholder():
    return f"// (( bind_button ))"