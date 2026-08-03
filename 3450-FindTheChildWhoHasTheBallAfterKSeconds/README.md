# 3178. Find the Child Who Has the Ball After K Seconds

**Difficulty:** Easy  
[View on LeetCode](https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/)

---

You are given two **positive** integers `n` and `k`. There are `n` children numbered from `0` to `n - 1` standing in a queue *in order* from left to right.

Initially, child 0 holds a ball and the direction of passing the ball is towards the right direction. After each second, the child holding the ball passes it to the child next to them. Once the ball reaches **either** end of the line, i.e. child 0 or child `n - 1`, the direction of passing is **reversed**.

Return the number of the child who receives the ball after `k` seconds.

**Example 1:**

**Input:** n = 3, k = 5

**Output:** 1

**Explanation:**

<table>
	<tbody>
		<tr>
			<th>Time elapsed</th>
			<th>Children</th>
		</tr>
		<tr>
			<td><code>0</code></td>
			<td><code>[<u>0</u>, 1, 2]</code></td>
		</tr>
		<tr>
			<td><code>1</code></td>
			<td><code>[0, <u>1</u>, 2]</code></td>
		</tr>
		<tr>
			<td><code>2</code></td>
			<td><code>[0, 1, <u>2</u>]</code></td>
		</tr>
		<tr>
			<td><code>3</code></td>
			<td><code>[0, <u>1</u>, 2]</code></td>
		</tr>
		<tr>
			<td><code>4</code></td>
			<td><code>[<u>0</u>, 1, 2]</code></td>
		</tr>
		<tr>
			<td><code>5</code></td>
			<td><code>[0, <u>1</u>, 2]</code></td>
		</tr>
	</tbody>
</table>

**Example 2:**

**Input:** n = 5, k = 6

**Output:** 2

**Explanation:**

<table>
	<tbody>
		<tr>
			<th>Time elapsed</th>
			<th>Children</th>
		</tr>
		<tr>
			<td><code>0</code></td>
			<td><code>[<u>0</u>, 1, 2, 3, 4]</code></td>
		</tr>
		<tr>
			<td><code>1</code></td>
			<td><code>[0, <u>1</u>, 2, 3, 4]</code></td>
		</tr>
		<tr>
			<td><code>2</code></td>
			<td><code>[0, 1, <u>2</u>, 3, 4]</code></td>
		</tr>
		<tr>
			<td><code>3</code></td>
			<td><code>[0, 1, 2, <u>3</u>, 4]</code></td>
		</tr>
		<tr>
			<td><code>4</code></td>
			<td><code>[0, 1, 2, 3, <u>4</u>]</code></td>
		</tr>
		<tr>
			<td><code>5</code></td>
			<td><code>[0, 1, 2, <u>3</u>, 4]</code></td>
		</tr>
		<tr>
			<td><code>6</code></td>
			<td><code>[0, 1, <u>2</u>, 3, 4]</code></td>
		</tr>
	</tbody>
</table>

**Example 3:**

**Input:** n = 4, k = 2

**Output:** 2

**Explanation:**

<table>
	<tbody>
		<tr>
			<th>Time elapsed</th>
			<th>Children</th>
		</tr>
		<tr>
			<td><code>0</code></td>
			<td><code>[<u>0</u>, 1, 2, 3]</code></td>
		</tr>
		<tr>
			<td><code>1</code></td>
			<td><code>[0, <u>1</u>, 2, 3]</code></td>
		</tr>
		<tr>
			<td><code>2</code></td>
			<td><code>[0, 1, <u>2</u>, 3]</code></td>
		</tr>
	</tbody>
</table>

**Constraints:**

- `2 <= n <= 50`
- `1 <= k <= 50`

**Note:** This question is the same as [2582: Pass the Pillow.](https://leetcode.com/problems/pass-the-pillow/description/)
