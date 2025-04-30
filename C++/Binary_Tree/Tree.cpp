#include<iostream>
#include<queue>
using namespace std;


class Node{
    public:
    int data;
    Node *lc;
    Node *rc;
};

class Tree{
    private:
    Node * root;
    public:
   Tree();
   void createTree();
   void inorder(Node *p);
   void inorder(){inorder(root);}
};

Tree::Tree(){
root=nullptr;
}
void Tree::createTree(){
    int val;
cout<<"Enter Root Node data: ";
cin>>val;
Node *n=new Node;
n->data=val;
n->lc=nullptr;
n->rc=nullptr;

root=n;
queue<Node*> q;
q.emplace(n);

while(q.empty()!=true){
   int lv;
    Node *tem=q.front();
    q.pop();
    cout<<"Enter Left child of "<<tem->data<<" :";
    cin>>lv;
    if(lv!=-1){
        Node* lt=new Node;
        lt->data=lv;
        lt->lc=nullptr;
        lt->rc=nullptr;

        q.emplace(lt);
        tem->lc=lt;
    }

    int r_val;
    cout<<"Enter Right child of "<<tem->data<<" :";
    cin>>r_val;
    if(r_val!=-1){
        Node* lr=new Node;
        lr->data=r_val;
        lr->lc=nullptr;
        lr->rc=nullptr;

        q.emplace(lr);
        tem->rc=lr;
    }

}

}

void Tree::inorder(Node* p){
    if(p){
        inorder(p->lc);
        cout<<p->data<<",";
        inorder(p->rc);
    }
}
int main(){
     Tree t; 
    t.createTree();
    cout<<"Tree is: "<<endl;
    t.inorder();

    return 0;
}