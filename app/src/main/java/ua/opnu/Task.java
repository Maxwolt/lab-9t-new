package ua.opnu;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();

        System.out.println("== Завдання 1 ==");
        List<String> list1 = new ArrayList<>(Arrays.asList("чотири", "сім", "та", "років", "тому", "назад"));
        System.out.println("До: " + list1);
        task.removeShorterStrings(list1);
        System.out.println("Після: " + list1);

        System.out.println();
        System.out.println("== Завдання 2 ==");
        List<String> list2 = new ArrayList<>(Arrays.asList("як", "твої", "справи?"));
        System.out.println("До: " + list2);
        task.stutter(list2);
        System.out.println("Після: " + list2);

        System.out.println();
        System.out.println("== Завдання 3 ==");
        List<String> list3 = new ArrayList<>(Arrays.asList("один", "два", "три", "чотири", "п'ять"));
        System.out.println("До: " + list3);
        task.switchPairs(list3);
        System.out.println("Після: " + list3);

        System.out.println();
        System.out.println("== Завдання 4 ==");
        List<String> list4 = new ArrayList<>(Arrays.asList(
                "бути", "бути", "або", "не", "не", "питання", "це", "це", "це"));
        System.out.println("До: " + list4);
        task.removeDuplicates(list4);
        System.out.println("Після: " + list4);

        System.out.println();
        System.out.println("== Завдання 5 ==");
        List<String> list5 = new ArrayList<>(Arrays.asList(
                "мова", "Java", "це", "дуже", "цікаво", "для", "кожного", "кота"));
        System.out.println("До: " + list5);
        task.markLength4(list5);
        System.out.println("Після: " + list5);

        System.out.println();
        System.out.println("== Завдання 6 ==");
        Queue<Integer> palindrome = new LinkedList<>(Arrays.asList(3, 8, 17, 9, 17, 8, 3));
        Queue<Integer> notPalindrome = new LinkedList<>(Arrays.asList(3, 8, 17, 9, 4, 17, 8, 3));
        System.out.println(palindrome + " паліндром: " + task.isPalindrome(palindrome));
        System.out.println("Черга після перевірки: " + palindrome);
        System.out.println(notPalindrome + " паліндром: " + task.isPalindrome(notPalindrome));
        System.out.println("Порожня черга паліндром: " + task.isPalindrome(new LinkedList<>()));

        System.out.println();
        System.out.println("== Завдання 7 ==");
        Queue<Integer> queue7 = new LinkedList<>(Arrays.asList(1, 2, -2, 4, -5, 8, -8, 12, -15, 23));
        System.out.println("До: " + queue7);
        task.reorder(queue7);
        System.out.println("Після: " + queue7);

        System.out.println();
        System.out.println("== Завдання 8 ==");
        Queue<Integer> queue8 = new LinkedList<>(Arrays.asList(3, 5, 4, 17, 6, 83, 1, 84, 16, 37));
        System.out.println("До: " + queue8);
        task.rearrange(queue8);
        System.out.println("Після: " + queue8);

        System.out.println();
        System.out.println("== Завдання 9 ==");
        Set<String> set9 = new HashSet<>(Arrays.asList("один", "два", "три", "чотирнадцять"));
        System.out.println(set9 + " -> найдовший рядок: " + task.maxLength(set9));
        System.out.println("Порожня множина -> " + task.maxLength(new HashSet<>()));

        System.out.println();
        System.out.println("== Завдання 10 ==");
        Set<String> set10 = new HashSet<>(Arrays.asList("кіт", "пес", "сова", "лисиця", "їжак", "!", "вовк"));
        System.out.println("До: " + set10);
        task.removeEvenLength(set10);
        System.out.println("Після: " + set10);

        System.out.println();
        System.out.println("== Завдання 11 ==");
        List<Integer> first = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> second = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);
        System.out.println(first + " та " + second + " -> спільних: " + task.numInCommon(first, second));

        System.out.println();
        System.out.println("== Завдання 12 ==");
        Map<String, String> unique = new TreeMap<>();
        unique.put("Тарас", "Шевченко");
        unique.put("Леся", "Українка");
        unique.put("Іван", "Франко");
        Map<String, String> notUnique = new TreeMap<>(unique);
        notUnique.put("Марко", "Шевченко");
        System.out.println(unique + " -> " + task.isUnique(unique));
        System.out.println(notUnique + " -> " + task.isUnique(notUnique));

        System.out.println();
        System.out.println("== Завдання 13 ==");
        Map<String, Integer> grades1 = new TreeMap<>();
        grades1.put("Олена", 87);
        grades1.put("Андрій", 62);
        grades1.put("Марія", 100);
        grades1.put("Петро", 80);
        Map<String, Integer> grades2 = new TreeMap<>();
        grades2.put("Андрій", 62);
        grades2.put("Марія", 95);
        grades2.put("Петро", 80);
        grades2.put("Ігор", 60);
        System.out.println(grades1 + " ∩ " + grades2 + " = " + task.intersect(grades1, grades2));

        System.out.println();
        System.out.println("== Завдання 14 ==");
        Map<Integer, String> byId = new TreeMap<>();
        byId.put(42, "Марія");
        byId.put(81, "Олег");
        byId.put(17, "Іра");
        byId.put(56, "Іра");
        byId.put(3, "Марія");
        System.out.println(byId + " -> " + task.reverse(byId));

        System.out.println();
        System.out.println("== Завдання 15 ==");
        Map<String, Integer> ages = new TreeMap<>();
        ages.put("Олена", 22);
        ages.put("Андрій", 25);
        ages.put("Дмитро", 25);
        ages.put("Петро", 20);
        ages.put("Катя", 20);
        ages.put("Іра", 20);
        ages.put("Марко", 25);
        ages.put("Роман", 25);
        ages.put("Софія", 22);
        System.out.println(ages + " -> найрідше значення: " + task.rarest(ages));

        System.out.println();
        System.out.println("== Завдання 16 ==");
        List<Integer> numbers = Arrays.asList(9, 7, 9, -1, 2, 9, 7, 2, 15, 15);
        System.out.println(numbers + " -> найчастіше число зустрічається разів: " + task.maxOccurrences(numbers));
        System.out.println("Порожній список -> " + task.maxOccurrences(new ArrayList<>()));
    }

    public void removeShorterStrings(List<String> list) {
        for (int i = 0; i + 1 < list.size(); i++) {
            if (list.get(i).length() <= list.get(i + 1).length()) {
                list.remove(i);
            } else {
                list.remove(i + 1);
            }
        }
    }

    public void stutter(List<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));
        }
    }

    public void switchPairs(List<String> list) {
        for (int i = 0; i + 1 < list.size(); i += 2) {
            list.set(i, list.set(i + 1, list.get(i)));
        }
    }

    public void removeDuplicates(List<String> list) {
        int i = 1;
        while (i < list.size()) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }

    public boolean isPalindrome(Queue<Integer> queue) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            stack.push(value);
            queue.add(value);
        }

        boolean palindrome = true;
        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            if (!value.equals(stack.pop())) {
                palindrome = false;
            }
            queue.add(value);
        }
        return palindrome;
    }

    public void reorder(Queue<Integer> queue) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();
        int nonNegative = 0;

        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            if (value < 0) {
                stack.push(value);
            } else {
                queue.add(value);
                nonNegative++;
            }
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < nonNegative; i++) {
            queue.add(queue.remove());
        }
    }

    public void rearrange(Queue<Integer> queue) {
        ArrayDeque<Integer> odds = new ArrayDeque<>();
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            if (value % 2 == 0) {
                queue.add(value);
            } else {
                odds.addLast(value);
            }
        }

        while (!odds.isEmpty()) {
            queue.add(odds.removeFirst());
        }
    }

    public int maxLength(Set<String> set) {
        int max = 0;
        for (String s : set) {
            max = Math.max(max, s.length());
        }
        return max;
    }

    public void removeEvenLength(Set<String> set) {
        set.removeIf(s -> s.length() % 2 == 0);
    }

    public int numInCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> common = new HashSet<>(list1);
        common.retainAll(new HashSet<>(list2));
        return common.size();
    }

    public boolean isUnique(Map<String, String> map) {
        return new HashSet<>(map.values()).size() == map.size();
    }

    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            Integer other = map2.get(entry.getKey());
            if (other != null && other.equals(entry.getValue())) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    public Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public int rarest(Map<String, Integer> map) {
        Map<Integer, Integer> counts = new TreeMap<>();
        for (Integer value : map.values()) {
            counts.merge(value, 1, Integer::sum);
        }

        int rarestValue = 0;
        int minCount = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                rarestValue = entry.getKey();
            }
        }
        return rarestValue;
    }

    public int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> counts = new HashMap<>();
        int max = 0;
        for (Integer value : list) {
            int count = counts.merge(value, 1, Integer::sum);
            max = Math.max(max, count);
        }
        return max;
    }
}
