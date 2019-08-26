
/*
Escreva um algortimo recursivo que receba como parametro um ponteiro para a raiz de uma
árvore binária e sem fazer alocações de novos nós, transforme em seu "espelho"
(os filhos esquerdo e direito de cada nó são trocados entre si)



      6
   /   \
  3     4
 / \   / \
7   3 8   1

     6
   /   \
  4     3
 / \   / \
1   8 3   7


*/


static void espelho(final TreeNode root) {
    final TreeNode temp = root.right;
    root.right = root.left;
    root.left = temp;

    if (root.left != null) {
        espelho(root.left);
    }

    if (root.right != null) {
        espelho(root.right);
    }
}