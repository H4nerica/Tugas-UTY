<?php
include_once '../Config/Database.php';

class Post{
    private $db;
    public function __construct(){
        $this->db = (new Database())->conn;
    }
    public function getPostsByUser($user_id) {
        $sql = "select * from posts where user_id = $user_id";
        return $this->db->query($sql);
    }
}
?>