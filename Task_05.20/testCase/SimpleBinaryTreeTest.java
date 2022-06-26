import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.course1.tree.BinaryTreeAlgorithms;
import ru.vsu.cs.course1.tree.SimpleBinaryTree;

import java.util.ArrayList;
import java.util.List;

class SimpleBinaryTreeTest {

    SimpleBinaryTree<Integer> tree = new SimpleBinaryTree<>(Integer::parseInt);
    SimpleBinaryTree<Integer> treeClone;
    List<Integer> treeValues = new ArrayList<>();
    List<Integer> treeCloneValues = new ArrayList<>();

    @Test
    void cloneTreeTest1() throws Exception {
        tree.fromBracketNotation("80 (62 (55 (26 (5, 39), 57)), 94)");
        treeClone = tree.cloneTree();

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(tree.getRoot())) {
            treeValues.add(i);
        }

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(treeClone.getRoot())) {
            treeCloneValues.add(i);
        }

        if (!tree.equals(treeClone)) {
            Assertions.assertEquals(treeValues, treeCloneValues);
        }
    }

    @Test
    void cloneTreeTest2() throws Exception {
        tree.fromBracketNotation("85 (42 (25 (10 (9), 28 (, 40 (32))), 64 (50 (, 58), 79 (73, 81))), 96 (91 (88), 99))");
        treeClone = tree.cloneTree();

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(tree.getRoot())) {
            treeValues.add(i);
        }

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(treeClone.getRoot())) {
            treeCloneValues.add(i);
        }

        if (!tree.equals(treeClone)) {
            Assertions.assertEquals(treeValues, treeCloneValues);
        }
    }

    @Test
    void cloneTreeTest3() throws Exception {
        tree.fromBracketNotation("70 (52 (56 (27 (88, 9), 47)), 24)");
        treeClone = tree.cloneTree();

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(tree.getRoot())) {
            treeValues.add(i);
        }

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(treeClone.getRoot())) {
            treeCloneValues.add(i);
        }

        if (!tree.equals(treeClone)) {
            Assertions.assertEquals(treeValues, treeCloneValues);
        }
    }

    @Test
    void cloneTreeTest4() throws Exception {
        tree.fromBracketNotation("153 (72 (543 (122), 110), 874 (843 (179 (, 240 (, 624 (384 (, 540 (467 (402 (351 (, 346))), 546 (52, 357))), 699 (680, 740 (, 821)))))), 855 (, 85 (, 694))))");
        treeClone = tree.cloneTree();

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(tree.getRoot())) {
            treeValues.add(i);
        }

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(treeClone.getRoot())) {
            treeCloneValues.add(i);
        }

        if (!tree.equals(treeClone)) {
            Assertions.assertEquals(treeValues, treeCloneValues);
        }
    }

    @Test
    void cloneTreeTest5() throws Exception {
        tree.fromBracketNotation("5 (43 (13 (1 (95), 58 (, 60 (34))), 44 (58 (, 19), 29 (23, 83))), 41 (2 (53), 95))");
        treeClone = tree.cloneTree();

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(tree.getRoot())) {
            treeValues.add(i);
        }

        for (Integer i : BinaryTreeAlgorithms.preOrderValues(treeClone.getRoot())) {
            treeCloneValues.add(i);
        }

        if (!tree.equals(treeClone)) {
            Assertions.assertEquals(treeValues, treeCloneValues);
        }
    }
}