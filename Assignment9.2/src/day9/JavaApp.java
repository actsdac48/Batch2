package day9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApp {

    static class Field {
        String accessSpecifier;
        String dataType;
        String name;

        Field(String accessSpecifier, String dataType, String name) {
            this.accessSpecifier = accessSpecifier;
            this.dataType = dataType;
            this.name = name;
        }

        @Override
        public String toString() {
            String access = accessSpecifier.equals("default") ? "" : accessSpecifier + " ";
            return access + dataType + " " + name + ";";
        }
    }

    static class Method {
        String accessSpecifier;
        String returnType;
        String name;
        List<String> parameters;

        Method(String accessSpecifier, String returnType, String name, List<String> parameters) {
            this.accessSpecifier = accessSpecifier;
            this.returnType = returnType;
            this.name = name;
            this.parameters = parameters;
        }

        @Override
        public String toString() {
            String access = accessSpecifier.equals("default") ? "" : accessSpecifier + " ";
            String params = String.join(", ", parameters);
            return access + returnType + " " + name + "(" + params + ") {\n        // TODO: implement\n    }";
        }
    }

   

    public static String getAccessSpecifier(Scanner scanner) {
        while (true) {
            System.out.println("Choose access specifier:");
            System.out.println("a. public");
            System.out.println("b. default");
            System.out.print("Option: ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("a")) return "public";
            else if (input.equals("b")) return "default";
            else System.out.println("Invalid option, please choose again.");
        }
    }

    public static void addField(Scanner scanner, List<Field> fields) {
        System.out.print("Enter data type: ");
        String dataType = scanner.nextLine().trim();

        String accessSpecifier = getAccessSpecifier(scanner);

        System.out.print("Enter variable name: ");
        String name = scanner.nextLine().trim();

        fields.add(new Field(accessSpecifier, dataType, name));
        System.out.println("Field added.");
    }

    public static void addMethod(Scanner scanner, List<Method> methods) {
        System.out.print("Enter return type: ");
        String returnType = scanner.nextLine().trim();

        String accessSpecifier = getAccessSpecifier(scanner);

        System.out.print("Enter method name: ");
        String name = scanner.nextLine().trim();

        List<String> parameters = new ArrayList<>();
        System.out.println("Enter parameters (type and name). Enter empty line to finish.");
        while (true) {
            System.out.print("Parameter (e.g. int count): ");
            String param = scanner.nextLine().trim();
            if (param.isEmpty()) break;
            parameters.add(param);
        }

        methods.add(new Method(accessSpecifier, returnType, name, parameters));
        System.out.println("Method added.");
    }

    public static void generateClassFile(String packageName, String classAccess, String className,
                                          List<Field> fields, List<Method> methods) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(className + ".java"))) {

            if (!packageName.isEmpty()) {
                writer.write("package " + packageName + ";\n\n");
            }

            String classAccessStr = classAccess.equals("default") ? "" : classAccess + " ";
            writer.write(classAccessStr + "class " + className + " {\n\n");

            for (Field field : fields) {
                writer.write("    " + field.toString() + "\n");
            }
            if (!fields.isEmpty()) writer.write("\n");

            for (Method method : methods) {
                writer.write("    " + method.toString() + "\n\n");
            }

            writer.write("}\n");
        } catch (IOException e) {
            System.out.println("Error writing class file: " + e.getMessage());
        }
    }
}

