class mergeBTS {
    private void insertLeft(Node root, Stack<Node> stack){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
    public List<Integer> merge(Node root1, Node root2){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        List<Integer> result = new ArrayList<>();

        insertLeft(root1, s1);
        insertLeft(root2, s2);

        while(!s1.isEmpty() || !s2.isEmpty()){
            int a=(!s1.isEmpty())?s1.peek().data:Integer.MAX_VALUE;
            int b=(!s2.isEmpty())?s2.peek().data:Integer.MAX_VALUE;
            if(a<=b){
                Node temp=s1.pop();
                result.add(a);
                insertLeft(temp.right, s1);
            }else{
                Node temp=s2.pop();
                result.add(b);
                insertLeft(temp.right, s2);
            }
        }
        return result;
    }
}