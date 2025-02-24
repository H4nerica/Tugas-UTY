<?php
include '../classes/User.php';
include '../classes/Post.php';
 
$user = new User();
$post = new Post();
$users = $user->getAllUsers();
?>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Pengguna dan Postingan</title>
</head>
<body>
    <h2>Daftar Pengguna dan Postingan</h2>
    <?php while ($row = $users->fetch_assoc()) { ?>
        <h3><?php echo $row['name']; ?> (<?php echo $row['email']; ?>)</h3>
        <ul>
            <?php
            $posts = $post->getPostsByUser($row['id']);
            while ($postRow = $posts->fetch_assoc()) {
                echo "<li><strong>{$postRow['title']}</strong>: {$postRow['content']}</li>";
            }
            ?>
        </ul>
    <?php } ?>
</body>
</html>