# Expression-Tree
Take the postfix expression and convert it into an expression tree.

The program runs in preorder, inorder, and postorder traversals in order to print prefix, infix (with appropriate parenthesis), and postfix expressions representing the input. It is able to handle multiple inputs before exiting (via Ctrl-C); after printing the results, it should ask for a subsequent infix expression on the console. When the user types in an expression: convert to postfix, convert to expression tree, print traversals.

Expression Trees
An expression tree is a data structure used to represent an arithmetic expression. There
are two types of nodes in an expression tree: operators and numbers. Number nodes
are leaves and have no children. Operator nodes have two children that are also
expression trees (each child can be an operator or a number). For example, the
expression (4 - 2) will be represented by an expression tree with a root operator node.
It'll store the fact that it's the subtraction operator, and it will have two children, each
number nodes 4 and 2.

A more complicated expression will have more nodes associated with it. Consider the
expression (9+6*2/(8-3)). This expression is the sum of two other expressions, so the
root will be an operator node, with operator "+", and two child expressions. The left child
will be the leaf node with number "9", but the right child is going to be an operator node
with operator "/". It's children are also operator nodes: the left child is 6*2 and the right
child is 8-3.

Methods
convert(), which takes a postfix expression and creates an expression tree out of it
prefix(), a preorder traversal of the tree
infix(), an inorder traversal of the tree
postfix(), a postorder traversal of the tree

The Algorithm
The algorithm for converting a postfix expression into an expression tree is similar to
some of the other conversion algorithms that you've done. Here are the steps:

1. Create an empty stack. Each element in the stack is going to be an expression
tree, so set the generic type accordingly.

2. Loop through each token in the postfix expression created by your converter.
a. If the token is a number, create a new expression tree node that
represents just that number and push it onto the stack
b. If the token is an operator, create a new operator expression. Pop two
expressions off the top of the stack, and set them as children of this new
node. Then push the node onto the stack

3. Once all the tokens in the postfix expression have been processed, the stack will
contain only one expression tree. Pop it out, and return it.

Example Output
Type your expression:

3*4+5

Prefix: +*345

Infix: ((3*4)+5)

Postfix: 34*5+

Inorder traversal will print the left child, followed by the operator, followed by the right
child. The result should look very similar to the original expression that was typed in by
the user. This needs to be surrounded by parenthesis in order to specify the correct
order of operations.
