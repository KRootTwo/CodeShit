#include <bits/stdc++.h>
#include <cstddef>

struct Node {
    int val{0};
    Node *left{nullptr};
    Node *rigt{nullptr};

    Node() = default;

    explicit Node (int v) : val(v) {}
    Node(int v, Node* l, Node* r) : val(v), left(l), rigt(r) {}
};

/* Traversals */
void preOrder(Node *root) {
    if (!root) return;
    std::cout << root->val << '\n';
    preOrder(root->left);
    preOrder(root->rigt);
}
void inOrder(Node *root) {
    if (!root) return;
    inOrder(root->left);
    std::cout << root->val << '\n';
    inOrder(root->rigt);
}
void postOrder(Node *root) {
    if (!root) return;
    postOrder(root->left);
    postOrder(root->rigt);
    std::cout << root->val << '\n';
}

void lvlOrder(Node *root, int lvl) {
    if (!root) return;
    if 
}
void levelOrder(Node *root) {
    lvlOrder(root, 0);
}

/* free shite */
void freeTree(Node *root) {
    if (!root) return;
    freeTree(root->left);
    freeTree(root->rigt);

    delete root;
}
int main() {

    Node *root = new Node(1);
    root->left = new Node(2);
    root->rigt = new Node(3);

    dispTree(root);

    freeTree(root);
    return 0;
}